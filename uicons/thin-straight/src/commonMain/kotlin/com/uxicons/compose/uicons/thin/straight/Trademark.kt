package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trademark: ImageVector? = null

val Icons.Ts.Trademark: ImageVector
    get() = _Trademark ?: UXIcon(name = "Trademark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 5f)
                lineTo(11f, 5f)
                verticalLineToRelative(1f)
                lineTo(6f, 6f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-1f)
                lineTo(5f, 6f)
                lineTo(0f, 6f)
                verticalLineToRelative(-1f)
                close()
                moveTo(23.11f, 5.04f)
                curveToRelative(-0.51f, -0.14f, -1.05f, 0.1f, -1.36f, 0.6f)
                lineToRelative(-3.75f, 6.69f)
                lineToRelative(-3.76f, -6.71f)
                curveToRelative(-0.3f, -0.49f, -0.84f, -0.73f, -1.35f, -0.59f)
                curveToRelative(-0.54f, 0.15f, -0.89f, 0.67f, -0.89f, 1.32f)
                verticalLineToRelative(12.63f)
                horizontalLineToRelative(1f)
                lineTo(13f, 6.37f)
                curveToRelative(0f, -0.23f, 0.09f, -0.34f, 0.16f, -0.36f)
                curveToRelative(0.08f, -0.02f, 0.16f, 0.03f, 0.22f, 0.13f)
                lineToRelative(4.62f, 8.25f)
                lineToRelative(4.61f, -8.24f)
                curveToRelative(0.06f, -0.11f, 0.15f, -0.16f, 0.23f, -0.14f)
                curveToRelative(0.07f, 0.02f, 0.16f, 0.13f, 0.16f, 0.36f)
                verticalLineToRelative(12.63f)
                horizontalLineToRelative(1f)
                lineTo(24f, 6.37f)
                curveToRelative(0f, -0.65f, -0.35f, -1.17f, -0.89f, -1.32f)
                close()
            }
        }.also { _Trademark = it}
