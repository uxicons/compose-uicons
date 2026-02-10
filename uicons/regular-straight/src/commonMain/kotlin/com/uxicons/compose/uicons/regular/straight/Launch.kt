package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Launch: ImageVector? = null

val Icons.Rs.Launch: ImageVector
    get() = _Launch ?: UXIcon(name = "Launch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 18f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(-4.9f)
                curveToRelative(0.14f, 0.67f, 0.24f, 1.34f, 0.31f, 2f)
                horizontalLineToRelative(2.6f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-4.91f)
                lineToRelative(-1f, 1f)
                horizontalLineToRelative(-4.17f)
                lineToRelative(-1f, -1f)
                horizontalLineToRelative(-4.91f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(2.6f)
                curveToRelative(0.07f, -0.67f, 0.17f, -1.33f, 0.3f, -2f)
                horizontalLineToRelative(-4.9f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(22f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-18f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6.09f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(5.83f)
                lineToRelative(1f, -1f)
                horizontalLineToRelative(6.09f)
                close()
                moveTo(7.12f, 13.81f)
                lineTo(8.31f, 15f)
                lineTo(10.28f, 13.04f)
                horizontalLineToRelative(0.72f)
                verticalLineToRelative(1.96f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.96f)
                horizontalLineToRelative(0.74f)
                lineToRelative(1.96f, 1.96f)
                lineToRelative(1.2f, -1.2f)
                curveToRelative(0.31f, -1.79f, -0.08f, -3.62f, -1.42f, -5.01f)
                curveToRelative(-0.15f, -2.51f, -0.87f, -5.06f, -2.26f, -8.01f)
                curveToRelative(-0.14f, -0.29f, -0.37f, -0.52f, -0.65f, -0.65f)
                curveToRelative(-0.33f, -0.15f, -0.7f, -0.18f, -1.03f, -0.06f)
                curveToRelative(-0.34f, 0.12f, -0.62f, 0.38f, -0.77f, 0.7f)
                curveToRelative(-1.38f, 2.93f, -2.09f, 5.47f, -2.25f, 8.0f)
                curveToRelative(-1.34f, 1.41f, -1.71f, 3.24f, -1.4f, 5.02f)
                close()
                moveTo(12.0f, 2.95f)
                curveToRelative(0.92f, 2.23f, 1.41f, 4.2f, 1.5f, 6.09f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.95f)
                curveToRelative(0.09f, -1.93f, 0.57f, -3.91f, 1.5f, -6.14f)
                close()
            }
        }.also { _Launch = it}
