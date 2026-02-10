package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SdCards: ImageVector? = null

val Icons.Bs.SdCards: ImageVector
    get() = _SdCards ?: UXIcon(name = "SdCards") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 0f)
                horizontalLineToRelative(-6.17f)
                curveToRelative(-0.94f, 0f, -1.81f, 0.36f, -2.48f, 1.02f)
                lineToRelative(-2.83f, 2.83f)
                curveToRelative(-0.66f, 0.66f, -1.02f, 1.54f, -1.02f, 2.48f)
                verticalLineToRelative(12.67f)
                horizontalLineToRelative(16f)
                lineTo(22.0f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(19f, 16f)
                horizontalLineToRelative(-10f)
                lineTo(9f, 6.33f)
                curveToRelative(0f, -0.13f, 0.05f, -0.26f, 0.15f, -0.35f)
                lineToRelative(2.83f, -2.83f)
                curveToRelative(0.1f, -0.1f, 0.22f, -0.15f, 0.35f, -0.15f)
                horizontalLineToRelative(6.17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(12.5f)
                close()
                moveTo(4f, 21f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(3f)
                lineTo(1f, 24f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0f, -1.76f, 1.31f, -3.2f, 3f, -3.45f)
                verticalLineToRelative(15.95f)
                close()
                moveTo(15f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                close()
                moveTo(12f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _SdCards = it}
