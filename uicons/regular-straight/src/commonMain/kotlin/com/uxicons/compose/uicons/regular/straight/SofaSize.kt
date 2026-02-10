package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SofaSize: ImageVector? = null

val Icons.Rs.SofaSize: ImageVector
    get() = _SofaSize ?: UXIcon(name = "SofaSize") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 13.18f)
                verticalLineToRelative(-1.18f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-8f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(1.18f)
                curveToRelative(-0.31f, -0.11f, -0.65f, -0.18f, -1f, -0.18f)
                lineTo(0f, 13f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.35f, 0f, -0.69f, 0.07f, -1f, 0.18f)
                close()
                moveTo(6f, 12f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(4f)
                lineTo(6f, 16f)
                verticalLineToRelative(-4f)
                close()
                moveTo(22f, 20f)
                lineTo(2f, 20f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5f)
                close()
                moveTo(0.53f, 5.25f)
                curveTo(0.21f, 4.98f, 0f, 4.5f, 0f, 4f)
                reflectiveCurveToRelative(0.21f, -0.98f, 0.59f, -1.32f)
                lineTo(3.01f, 0.08f)
                lineToRelative(1.46f, 1.36f)
                lineToRelative(-1.45f, 1.56f)
                horizontalLineToRelative(17.96f)
                lineToRelative(-1.46f, -1.56f)
                lineToRelative(1.46f, -1.36f)
                lineToRelative(2.49f, 2.67f)
                curveToRelative(0.31f, 0.27f, 0.52f, 0.75f, 0.52f, 1.25f)
                reflectiveCurveToRelative(-0.21f, 0.98f, -0.59f, 1.32f)
                lineToRelative(-2.5f, 2.68f)
                lineToRelative(-1.46f, -1.36f)
                lineToRelative(1.53f, -1.64f)
                lineTo(3.02f, 5.0f)
                lineToRelative(1.5f, 1.61f)
                lineToRelative(-1.46f, 1.36f)
                lineTo(0.53f, 5.25f)
                close()
            }
        }.also { _SofaSize = it}
