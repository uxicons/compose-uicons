package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SdCards: ImageVector? = null

val Icons.Ss.SdCards: ImageVector
    get() = _SdCards ?: UXIcon(name = "SdCards") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                horizontalLineToRelative(-7.17f)
                curveToRelative(-0.8f, 0f, -1.55f, 0.31f, -2.12f, 0.88f)
                lineToRelative(-2.83f, 2.83f)
                curveToRelative(-0.57f, 0.57f, -0.88f, 1.32f, -0.88f, 2.12f)
                verticalLineToRelative(14.17f)
                horizontalLineToRelative(16f)
                lineTo(22f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(13f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                close()
                moveTo(16f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                close()
                moveTo(19f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                close()
                moveTo(4f, 22f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                lineTo(2f, 24f)
                verticalLineToRelative(-14.17f)
                curveToRelative(0f, -0.8f, 0.31f, -1.55f, 0.88f, -2.12f)
                lineToRelative(1.12f, -1.12f)
                verticalLineToRelative(15.41f)
                close()
            }
        }.also { _SdCards = it}
