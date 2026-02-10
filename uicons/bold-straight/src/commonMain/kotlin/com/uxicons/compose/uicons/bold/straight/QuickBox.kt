package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _QuickBox: ImageVector? = null

val Icons.Bs.QuickBox: ImageVector
    get() = _QuickBox ?: UXIcon(name = "QuickBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 13f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8f)
                close()
                moveTo(6f, 15f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                close()
                moveTo(0f, 23f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(23.96f, 5.0f)
                lineTo(21.29f, 23f)
                horizontalLineToRelative(-15.29f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(12.71f)
                lineToRelative(1.63f, -11f)
                horizontalLineToRelative(-3.3f)
                lineToRelative(-0.61f, 4f)
                horizontalLineToRelative(-6.43f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3.85f)
                lineToRelative(0.92f, -6f)
                horizontalLineToRelative(-2.46f)
                lineToRelative(-0.66f, 4f)
                horizontalLineToRelative(-3.03f)
                lineToRelative(0.64f, -4f)
                horizontalLineToRelative(-2.55f)
                curveToRelative(-0.35f, 0f, -0.64f, 0.26f, -0.69f, 0.6f)
                lineToRelative(-0.58f, 3.4f)
                horizontalLineToRelative(-3.03f)
                lineToRelative(0.6f, -3.57f)
                curveToRelative(0.28f, -1.97f, 1.97f, -3.43f, 3.96f, -3.43f)
                horizontalLineToRelative(13.53f)
                curveToRelative(1.01f, 0f, 1.98f, 0.44f, 2.64f, 1.21f)
                reflectiveCurveToRelative(0.96f, 1.78f, 0.82f, 2.79f)
                close()
                moveTo(20.78f, 6f)
                lineTo(21.0f, 4.56f)
                curveToRelative(0.03f, -0.19f, -0.06f, -0.33f, -0.12f, -0.39f)
                reflectiveCurveToRelative(-0.18f, -0.17f, -0.38f, -0.17f)
                horizontalLineToRelative(-2.69f)
                lineToRelative(-0.31f, 2f)
                close()
                moveTo(12.8f, 15f)
                lineTo(12.37f, 18f)
                horizontalLineToRelative(4.4f)
                lineToRelative(0.43f, -3f)
                close()
            }
        }.also { _QuickBox = it}
