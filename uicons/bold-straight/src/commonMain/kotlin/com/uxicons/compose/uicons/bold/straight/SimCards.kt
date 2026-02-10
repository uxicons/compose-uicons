package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SimCards: ImageVector? = null

val Icons.Bs.SimCards: ImageVector
    get() = _SimCards ?: UXIcon(name = "SimCards") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.98f, 3.85f)
                lineToRelative(-2.83f, -2.83f)
                curveToRelative(-0.66f, -0.66f, -1.54f, -1.02f, -2.48f, -1.02f)
                horizontalLineToRelative(-6.17f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(16f)
                lineTo(22f, 6.33f)
                curveToRelative(0f, -0.94f, -0.36f, -1.81f, -1.02f, -2.48f)
                close()
                moveTo(19f, 16f)
                horizontalLineToRelative(-10f)
                lineTo(9f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(6.17f)
                curveToRelative(0.13f, 0f, 0.26f, 0.05f, 0.35f, 0.15f)
                lineToRelative(2.83f, 2.83f)
                curveToRelative(0.09f, 0.09f, 0.15f, 0.22f, 0.15f, 0.35f)
                verticalLineToRelative(9.67f)
                close()
                moveTo(4f, 21f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(3f)
                lineTo(1f, 24f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0f, -1.76f, 1.31f, -3.2f, 3f, -3.45f)
                verticalLineToRelative(15.95f)
                close()
                moveTo(14f, 11f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3f)
                close()
                moveTo(18f, 9.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(10f, 12f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(14f, 12f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _SimCards = it}
