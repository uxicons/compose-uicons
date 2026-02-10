package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArtificialIntelligence: ImageVector? = null

val Icons.Bs.ArtificialIntelligence: ImageVector
    get() = _ArtificialIntelligence ?: UXIcon(name = "ArtificialIntelligence") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-8f)
                close()
                moveTo(19.5f, 9f)
                lineToRelative(1.5f, -3f)
                lineToRelative(3f, -1.5f)
                lineToRelative(-3f, -1.5f)
                lineToRelative(-1.5f, -3f)
                lineToRelative(-1.5f, 3f)
                lineToRelative(-3f, 1.5f)
                lineToRelative(3f, 1.5f)
                lineToRelative(1.5f, 3f)
                close()
                moveTo(12.06f, 7.1f)
                lineToRelative(2.94f, 11.9f)
                horizontalLineToRelative(-3.08f)
                lineToRelative(-0.5f, -2f)
                horizontalLineToRelative(-3.84f)
                lineToRelative(-0.5f, 2f)
                horizontalLineToRelative(-3.08f)
                lineToRelative(2.95f, -11.97f)
                curveToRelative(0.17f, -0.75f, 0.67f, -1.39f, 1.36f, -1.74f)
                curveToRelative(0.7f, -0.36f, 1.51f, -0.38f, 2.26f, -0.07f)
                curveToRelative(0.74f, 0.31f, 1.29f, 1.01f, 1.5f, 1.88f)
                close()
                moveTo(11.0f, 14f)
                lineToRelative(-1.5f, -6f)
                lineToRelative(-1.5f, 6f)
                horizontalLineToRelative(2.99f)
                close()
                moveTo(21f, 11f)
                verticalLineToRelative(10f)
                lineTo(3f, 21f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(9.5f)
                lineTo(13f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _ArtificialIntelligence = it}
