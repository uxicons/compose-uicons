package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShareSquare: ImageVector? = null

val Icons.Ss.ShareSquare: ImageVector
    get() = _ShareSquare ?: UXIcon(name = "ShareSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.41f, 9.41f)
                lineToRelative(-6.61f, 6.61f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(5.61f, -5.61f)
                lineTo(11f, 9f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                lineTo(8f, 10f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(10f)
                lineTo(15.44f, 1.44f)
                lineTo(16.86f, 0.03f)
                lineToRelative(6.56f, 6.56f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0f, 2.83f)
                close()
                moveTo(12f, 14.03f)
                verticalLineToRelative(5.96f)
                lineTo(6f, 19.99f)
                lineTo(6f, 10f)
                curveToRelative(0f, -1.13f, 0.39f, -2.16f, 1.03f, -3f)
                lineTo(3f, 7f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(14f)
                lineTo(17f, 24f)
                verticalLineToRelative(-4.96f)
                lineToRelative(-5f, -5f)
                close()
            }
        }.also { _ShareSquare = it}
