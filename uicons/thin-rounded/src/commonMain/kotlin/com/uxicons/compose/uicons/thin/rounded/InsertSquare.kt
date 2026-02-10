package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsertSquare: ImageVector? = null

val Icons.Tr.InsertSquare: ImageVector
    get() = _InsertSquare ?: UXIcon(name = "InsertSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.85f, 10.14f)
                curveToRelative(0.2f, 0.19f, 0.2f, 0.51f, 0.01f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.36f, 0.15f)
                curveToRelative(-0.13f, 0f, -0.25f, -0.05f, -0.35f, -0.14f)
                lineToRelative(-4.65f, -4.57f)
                verticalLineToRelative(17.21f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(11.5f, 6.29f)
                lineToRelative(-4.65f, 4.57f)
                curveToRelative(-0.2f, 0.19f, -0.51f, 0.19f, -0.71f, -0.01f)
                curveToRelative(-0.19f, -0.2f, -0.19f, -0.51f, 0.01f, -0.71f)
                lineToRelative(4.79f, -4.71f)
                curveToRelative(0.29f, -0.29f, 0.67f, -0.44f, 1.06f, -0.44f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                curveToRelative(0.01f, 0f, 0.02f, 0.01f, 0.04f, 0.01f)
                curveToRelative(0.37f, 0.01f, 0.74f, 0.15f, 1.02f, 0.43f)
                lineToRelative(4.79f, 4.7f)
                close()
                moveTo(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(19f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(19f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
            }
        }.also { _InsertSquare = it}
