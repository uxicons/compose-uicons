package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Leave: ImageVector? = null

val Icons.Ts.Leave: ImageVector
    get() = _Leave ?: UXIcon(name = "Leave") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.62f, 15.39f)
                lineToRelative(-2.86f, 2.86f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(2.55f, -2.55f)
                horizontalLineToRelative(-8.6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8.66f)
                lineToRelative(-2.61f, -2.61f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(2.86f, 2.86f)
                curveToRelative(0.51f, 0.51f, 0.51f, 1.34f, 0f, 1.85f)
                close()
                moveTo(8f, 11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(15f, 17f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(7f)
                lineTo(0f, 24f)
                lineTo(0f, 3.9f)
                curveTo(0f, 2.71f, 0.84f, 1.68f, 2.01f, 1.45f)
                lineTo(9.01f, 0.05f)
                curveToRelative(0.74f, -0.15f, 1.49f, 0.04f, 2.08f, 0.52f)
                curveToRelative(0.45f, 0.37f, 0.75f, 0.88f, 0.86f, 1.43f)
                horizontalLineToRelative(1.56f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                close()
                moveTo(11f, 2.5f)
                curveToRelative(0f, -0.45f, -0.2f, -0.87f, -0.55f, -1.16f)
                curveToRelative(-0.35f, -0.29f, -0.8f, -0.4f, -1.25f, -0.31f)
                lineToRelative(-7f, 1.4f)
                curveToRelative(-0.7f, 0.14f, -1.21f, 0.76f, -1.21f, 1.47f)
                verticalLineToRelative(19.1f)
                horizontalLineToRelative(10f)
                lineTo(11f, 2.5f)
                close()
            }
        }.also { _Leave = it}
