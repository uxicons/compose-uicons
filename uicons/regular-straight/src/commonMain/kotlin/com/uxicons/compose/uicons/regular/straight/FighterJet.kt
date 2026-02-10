package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FighterJet: ImageVector? = null

val Icons.Rs.FighterJet: ImageVector
    get() = _FighterJet ?: UXIcon(name = "FighterJet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.58f, 8.56f)
                lineTo(11.58f, 2f)
                lineTo(13f, 2f)
                lineTo(13f, 0f)
                lineTo(7f, 0f)
                lineTo(7f, 9f)
                lineTo(5.54f, 9f)
                lineTo(4.44f, 7.34f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.94f, 6f)
                lineTo(0f, 6f)
                lineTo(0f, 18f)
                lineTo(1.95f, 18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, -1.35f)
                lineTo(5.54f, 15f)
                lineTo(7f, 15f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(6f)
                lineTo(13f, 22f)
                lineTo(11.58f, 22f)
                lineToRelative(4f, -6.53f)
                curveTo(26.84f, 14.9f, 26.84f, 9.09f, 15.58f, 8.56f)
                close()
                moveTo(14.94f, 13.51f)
                lineTo(14.42f, 13.54f)
                lineTo(9.24f, 22f)
                lineTo(9f, 22f)
                lineTo(9f, 13f)
                lineTo(4.46f, 13f)
                lineTo(2.79f, 15.55f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 16f)
                lineTo(2f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.77f, 0.45f)
                lineTo(4.46f, 11f)
                lineTo(9f, 11f)
                lineTo(9f, 2f)
                horizontalLineToRelative(0.24f)
                lineToRelative(5.18f, 8.49f)
                lineToRelative(0.52f, 0.03f)
                curveToRelative(3.14f, 0.19f, 6.33f, 0.87f, 6.99f, 1.48f)
                curveTo(21.27f, 12.61f, 18.08f, 13.31f, 14.94f, 13.51f)
                close()
            }
        }.also { _FighterJet = it}
