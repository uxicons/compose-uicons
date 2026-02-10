package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Messages: ImageVector? = null

val Icons.Rs.Messages: ImageVector
    get() = _Messages ?: UXIcon(name = "Messages") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(14.85f)
                curveToRelative(0f, 0.79f, 0.43f, 1.52f, 1.13f, 1.89f)
                curveToRelative(0.32f, 0.17f, 0.67f, 0.26f, 1.01f, 0.26f)
                curveToRelative(0.42f, 0f, 0.83f, -0.12f, 1.19f, -0.36f)
                lineToRelative(2.66f, -1.77f)
                verticalLineToRelative(3.13f)
                horizontalLineToRelative(10.7f)
                lineToRelative(3.96f, 2.64f)
                curveToRelative(0.36f, 0.24f, 0.77f, 0.36f, 1.19f, 0.36f)
                curveToRelative(0.35f, 0f, 0.7f, -0.09f, 1.01f, -0.26f)
                curveToRelative(0.7f, -0.37f, 1.13f, -1.1f, 1.13f, -1.89f)
                lineTo(24f, 7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(2.23f, 17.98f)
                curveToRelative(-0.02f, 0.01f, -0.07f, 0.05f, -0.15f, 0.01f)
                curveToRelative(-0.08f, -0.04f, -0.08f, -0.11f, -0.08f, -0.13f)
                lineTo(2.0f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(12f)
                lineTo(6.7f, 15f)
                lineToRelative(-4.47f, 2.98f)
                close()
                moveTo(22f, 21.86f)
                curveToRelative(0f, 0.02f, 0f, 0.09f, -0.08f, 0.13f)
                curveToRelative(-0.08f, 0.04f, -0.13f, 0.01f, -0.15f, -0.01f)
                lineToRelative(-4.47f, -2.98f)
                horizontalLineToRelative(-9.3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10f)
                lineTo(18f, 6f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(14.85f)
                close()
            }
        }.also { _Messages = it}
