package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArtificialIntelligence: ImageVector? = null

val Icons.Rs.ArtificialIntelligence: ImageVector
    get() = _ArtificialIntelligence ?: UXIcon(name = "ArtificialIntelligence") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                close()
                moveTo(19.75f, 8.5f)
                lineToRelative(1.42f, -2.83f)
                lineToRelative(2.83f, -1.42f)
                lineToRelative(-2.83f, -1.42f)
                lineTo(19.75f, 0f)
                lineToRelative(-1.42f, 2.83f)
                lineToRelative(-2.83f, 1.42f)
                lineToRelative(2.83f, 1.42f)
                lineToRelative(1.42f, 2.83f)
                close()
                moveTo(11.58f, 6.72f)
                lineToRelative(3.42f, 12.28f)
                horizontalLineToRelative(-2.05f)
                lineToRelative(-0.85f, -3f)
                horizontalLineToRelative(-5.21f)
                lineToRelative(-0.85f, 3f)
                horizontalLineToRelative(-2.05f)
                lineToRelative(3.44f, -12.36f)
                curveToRelative(0.14f, -0.61f, 0.54f, -1.12f, 1.1f, -1.41f)
                curveToRelative(0.57f, -0.29f, 1.22f, -0.31f, 1.84f, -0.05f)
                curveToRelative(0.59f, 0.25f, 1.04f, 0.82f, 1.2f, 1.53f)
                close()
                moveTo(11.54f, 14f)
                lineToRelative(-1.93f, -6.83f)
                curveToRelative(-0.03f, -0.11f, -0.19f, -0.11f, -0.22f, 0f)
                lineToRelative(-1.93f, 6.83f)
                horizontalLineToRelative(4.08f)
                close()
                moveTo(22.0f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(11f)
                lineTo(14f, 0f)
                lineTo(3f, 0f)
                curveTo(1.34f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(13f)
                close()
            }
        }.also { _ArtificialIntelligence = it}
