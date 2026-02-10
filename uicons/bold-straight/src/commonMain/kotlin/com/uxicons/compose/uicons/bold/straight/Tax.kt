package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tax: ImageVector? = null

val Icons.Bs.Tax: ImageVector
    get() = _Tax ?: UXIcon(name = "Tax") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 21f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                lineTo(0f, 2.99f)
                curveTo(0f, 1.34f, 1.35f, -0.01f, 3f, -0.01f)
                horizontalLineToRelative(11.38f)
                lineToRelative(5.62f, 5.67f)
                verticalLineToRelative(3.34f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.01f)
                horizontalLineToRelative(-5f)
                lineTo(12f, 2.99f)
                lineTo(3f, 2.99f)
                verticalLineToRelative(18.01f)
                close()
                moveTo(8.3f, 19f)
                verticalLineToRelative(-6.4f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(6.4f)
                horizontalLineToRelative(1.6f)
                close()
                moveTo(11.81f, 19f)
                horizontalLineToRelative(-1.61f)
                lineToRelative(1.48f, -6.42f)
                curveToRelative(0.13f, -0.58f, 0.49f, -1.08f, 1.0f, -1.36f)
                curveToRelative(0.28f, -0.15f, 0.58f, -0.23f, 0.88f, -0.23f)
                curveToRelative(0.26f, 0f, 0.53f, 0.06f, 0.78f, 0.17f)
                curveToRelative(0.55f, 0.25f, 0.97f, 0.79f, 1.12f, 1.46f)
                lineToRelative(1.45f, 6.37f)
                horizontalLineToRelative(-1.61f)
                lineToRelative(-0.33f, -1.4f)
                horizontalLineToRelative(-2.83f)
                lineToRelative(-0.33f, 1.4f)
                close()
                moveTo(12.51f, 16.0f)
                horizontalLineToRelative(2.08f)
                lineToRelative(-0.7f, -3.02f)
                curveToRelative(-0.05f, -0.21f, -0.15f, -0.33f, -0.21f, -0.35f)
                curveToRelative(-0.05f, -0.02f, -0.09f, -0.03f, -0.13f, -0.03f)
                curveToRelative(-0.04f, 0f, -0.08f, 0.01f, -0.12f, 0.03f)
                curveToRelative(-0.1f, 0.05f, -0.17f, 0.16f, -0.2f, 0.29f)
                lineToRelative(-0.73f, 3.08f)
                close()
                moveTo(23.0f, 11.0f)
                horizontalLineToRelative(-1.81f)
                lineToRelative(-1.09f, 2.18f)
                lineToRelative(-1.09f, -2.18f)
                horizontalLineToRelative(-1.81f)
                lineToRelative(1.99f, 4f)
                lineToRelative(-1.99f, 4f)
                horizontalLineToRelative(1.81f)
                lineToRelative(1.09f, -2.18f)
                lineToRelative(1.09f, 2.18f)
                horizontalLineToRelative(1.81f)
                lineToRelative(-1.99f, -4f)
                lineToRelative(1.99f, -4f)
                close()
            }
        }.also { _Tax = it}
