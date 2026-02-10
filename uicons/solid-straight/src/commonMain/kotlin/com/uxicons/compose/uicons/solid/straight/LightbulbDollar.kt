package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightbulbDollar: ImageVector? = null

val Icons.Ss.LightbulbDollar: ImageVector
    get() = _LightbulbDollar ?: UXIcon(name = "LightbulbDollar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.0f, 21f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                lineTo(8.0f, 24f)
                verticalLineToRelative(-3f)
                close()
                moveTo(21.0f, 9f)
                curveToRelative(0f, 2.59f, -1.12f, 5.05f, -3.07f, 6.76f)
                curveToRelative(-0.92f, 0.81f, -1.55f, 1.95f, -1.8f, 3.24f)
                lineTo(7.88f, 19f)
                curveToRelative(-0.26f, -1.25f, -0.95f, -2.44f, -2.01f, -3.42f)
                curveToRelative(-2.15f, -2.0f, -3.17f, -4.83f, -2.79f, -7.76f)
                curveTo(3.59f, 3.78f, 6.91f, 0.52f, 10.96f, 0.06f)
                curveToRelative(2.57f, -0.29f, 5.13f, 0.52f, 7.04f, 2.23f)
                curveToRelative(1.91f, 1.71f, 3.01f, 4.15f, 3.01f, 6.71f)
                close()
                moveTo(10f, 8f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 1.36f, 0.97f, 2.51f, 2.31f, 2.73f)
                lineToRelative(3.04f, 0.51f)
                curveToRelative(0.37f, 0.06f, 0.64f, 0.38f, 0.64f, 0.76f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.36f, -0.97f, -2.51f, -2.31f, -2.73f)
                lineToRelative(-3.04f, -0.51f)
                curveToRelative(-0.37f, -0.06f, -0.64f, -0.38f, -0.64f, -0.76f)
                close()
            }
        }.also { _LightbulbDollar = it}
