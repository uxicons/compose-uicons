package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tax: ImageVector? = null

val Icons.Rs.Tax: ImageVector
    get() = _Tax ?: UXIcon(name = "Tax") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.41f)
                lineTo(12.41f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-2f)
                lineTo(2f, 22f)
                lineTo(2f, 3f)
                close()
                moveTo(13f, 3.41f)
                lineToRelative(3.59f, 3.59f)
                horizontalLineToRelative(-3.59f)
                verticalLineToRelative(-3.59f)
                close()
                moveTo(12.14f, 18.6f)
                horizontalLineToRelative(2.83f)
                lineToRelative(0.33f, 1.4f)
                horizontalLineToRelative(1.61f)
                lineToRelative(-1.45f, -6.37f)
                curveToRelative(-0.15f, -0.67f, -0.56f, -1.21f, -1.12f, -1.46f)
                curveToRelative(-0.25f, -0.11f, -0.51f, -0.17f, -0.78f, -0.17f)
                curveToRelative(-0.3f, 0f, -0.61f, 0.07f, -0.88f, 0.23f)
                curveToRelative(-0.51f, 0.28f, -0.88f, 0.78f, -1.0f, 1.36f)
                lineToRelative(-1.48f, 6.42f)
                horizontalLineToRelative(1.61f)
                lineToRelative(0.33f, -1.4f)
                close()
                moveTo(13.24f, 13.92f)
                curveToRelative(0.03f, -0.13f, 0.1f, -0.24f, 0.2f, -0.29f)
                curveToRelative(0.04f, -0.02f, 0.08f, -0.03f, 0.12f, -0.03f)
                curveToRelative(0.04f, 0f, 0.08f, 0.01f, 0.13f, 0.03f)
                curveToRelative(0.06f, 0.03f, 0.16f, 0.14f, 0.21f, 0.35f)
                lineToRelative(0.7f, 3.02f)
                horizontalLineToRelative(-2.08f)
                lineToRelative(0.73f, -3.08f)
                close()
                moveTo(6.7f, 20f)
                verticalLineToRelative(-6.4f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6.4f)
                horizontalLineToRelative(-1.6f)
                close()
                moveTo(21.0f, 16f)
                lineToRelative(1.99f, 4f)
                horizontalLineToRelative(-1.81f)
                lineToRelative(-1.09f, -2.18f)
                lineToRelative(-1.09f, 2.18f)
                horizontalLineToRelative(-1.81f)
                lineToRelative(1.99f, -4f)
                lineToRelative(-1.99f, -4f)
                horizontalLineToRelative(1.81f)
                lineToRelative(1.09f, 2.18f)
                lineToRelative(1.09f, -2.18f)
                horizontalLineToRelative(1.81f)
                lineToRelative(-1.99f, 4f)
                close()
            }
        }.also { _Tax = it}
