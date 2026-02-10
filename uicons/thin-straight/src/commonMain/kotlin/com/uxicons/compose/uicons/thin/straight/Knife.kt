package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Knife: ImageVector? = null

val Icons.Ts.Knife: ImageVector
    get() = _Knife ?: UXIcon(name = "Knife") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.97f, 0.12f)
                curveToRelative(-0.67f, -0.27f, -1.43f, -0.1f, -1.94f, 0.44f)
                lineTo(0.02f, 23.27f)
                lineToRelative(0.73f, 0.68f)
                lineToRelative(5.5f, -5.94f)
                curveToRelative(13.49f, -1.04f, 17.75f, -12.73f, 17.75f, -15.97f)
                verticalLineToRelative(-0.37f)
                curveToRelative(0f, -0.71f, -0.39f, -1.31f, -1.03f, -1.56f)
                close()
                moveTo(23.0f, 2.05f)
                curveToRelative(0f, 2.94f, -3.8f, 13.35f, -15.73f, 14.86f)
                lineTo(21.77f, 1.25f)
                curveToRelative(0.17f, -0.18f, 0.38f, -0.25f, 0.56f, -0.25f)
                curveToRelative(0.1f, 0f, 0.2f, 0.02f, 0.27f, 0.05f)
                curveToRelative(0.15f, 0.06f, 0.4f, 0.22f, 0.4f, 0.63f)
                verticalLineToRelative(0.37f)
                close()
            }
        }.also { _Knife = it}
