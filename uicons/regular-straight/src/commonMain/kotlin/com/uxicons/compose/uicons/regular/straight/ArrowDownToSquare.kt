package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownToSquare: ImageVector? = null

val Icons.Rs.ArrowDownToSquare: ImageVector
    get() = _ArrowDownToSquare ?: UXIcon(name = "ArrowDownToSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.99f, 8f)
                verticalLineToRelative(15.99f)
                lineTo(2f, 23.99f)
                reflectiveCurveToRelative(0f, -15.99f, 0f, -15.99f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                lineTo(5f, 7f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(15.99f)
                lineTo(19.99f, 7.99f)
                curveToRelative(0f, -0.27f, -0.1f, -0.51f, -0.29f, -0.7f)
                curveToRelative(-0.19f, -0.19f, -0.44f, -0.29f, -0.71f, -0.29f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                curveToRelative(0.8f, 0f, 1.56f, 0.31f, 2.13f, 0.88f)
                curveToRelative(0.56f, 0.57f, 0.87f, 1.32f, 0.87f, 2.11f)
                close()
                moveTo(7.19f, 10.82f)
                lineToRelative(-1.47f, 1.36f)
                lineToRelative(4.86f, 5.23f)
                curveToRelative(0.39f, 0.39f, 0.89f, 0.58f, 1.4f, 0.58f)
                reflectiveCurveToRelative(1.04f, -0.2f, 1.45f, -0.61f)
                lineToRelative(4.83f, -5.21f)
                lineToRelative(-1.47f, -1.36f)
                lineToRelative(-3.8f, 4.15f)
                lineTo(12.99f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(10.99f, 14.92f)
                lineToRelative(-3.8f, -4.1f)
                close()
            }
        }.also { _ArrowDownToSquare = it}
