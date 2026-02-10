package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tax: ImageVector? = null

val Icons.Ss.Tax: ImageVector
    get() = _Tax ?: UXIcon(name = "Tax") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.41f, 5f)
                horizontalLineToRelative(-4.41f)
                lineTo(17f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(11.88f, 13.63f)
                curveToRelative(-0.05f, -0.02f, -0.09f, -0.03f, -0.13f, -0.03f)
                curveToRelative(-0.04f, 0f, -0.08f, 0.01f, -0.12f, 0.03f)
                curveToRelative(-0.1f, 0.05f, -0.17f, 0.16f, -0.2f, 0.29f)
                lineToRelative(-0.73f, 3.08f)
                horizontalLineToRelative(2.08f)
                lineToRelative(-0.7f, -3.02f)
                curveToRelative(-0.05f, -0.21f, -0.15f, -0.33f, -0.21f, -0.35f)
                close()
                moveTo(22f, 7f)
                verticalLineToRelative(17f)
                lineTo(2f, 24f)
                lineTo(2f, 3f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                close()
                moveTo(6.5f, 13.6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.6f)
                lineTo(3f, 12f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(6.4f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-6.4f)
                close()
                moveTo(15.1f, 20f)
                lineToRelative(-1.45f, -6.37f)
                curveToRelative(-0.15f, -0.67f, -0.56f, -1.21f, -1.12f, -1.46f)
                curveToRelative(-0.25f, -0.11f, -0.51f, -0.17f, -0.78f, -0.17f)
                curveToRelative(-0.3f, 0f, -0.61f, 0.07f, -0.88f, 0.23f)
                curveToRelative(-0.51f, 0.28f, -0.88f, 0.78f, -1.0f, 1.36f)
                lineToRelative(-1.48f, 6.42f)
                horizontalLineToRelative(1.61f)
                lineToRelative(0.33f, -1.4f)
                horizontalLineToRelative(2.83f)
                lineToRelative(0.33f, 1.4f)
                horizontalLineToRelative(1.61f)
                close()
                moveTo(19.21f, 16.0f)
                lineToRelative(1.99f, -4f)
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
                close()
            }
        }.also { _Tax = it}
