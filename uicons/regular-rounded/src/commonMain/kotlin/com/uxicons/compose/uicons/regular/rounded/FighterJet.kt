package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FighterJet: ImageVector? = null

val Icons.Rr.FighterJet: ImageVector
    get() = _FighterJet ?: UXIcon(name = "FighterJet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.58f, 8.56f)
                lineTo(11.58f, 2f)
                lineTo(13f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                reflectiveCurveTo(9.64f, 0.01f, 9.53f, 0.04f)
                arcTo(3.0f, 3.0f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 3f)
                lineTo(7f, 9f)
                lineTo(5.54f, 9f)
                lineTo(4.44f, 7.34f)
                curveTo(3.39f, 5.55f, 0.07f, 5.45f, 0f, 7.94f)
                verticalLineToRelative(8.12f)
                curveToRelative(0.07f, 2.5f, 3.42f, 2.39f, 4.46f, 0.58f)
                lineTo(5.54f, 15f)
                lineTo(7f, 15f)
                verticalLineToRelative(6f)
                arcToRelative(3.0f, 3.0f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.53f, 2.96f)
                curveTo(9.62f, 23.99f, 13f, 24f, 13f, 24f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                lineTo(11.58f, 22f)
                lineToRelative(4f, -6.53f)
                curveTo(26.84f, 14.9f, 26.84f, 9.09f, 15.58f, 8.56f)
                close()
                moveTo(14.94f, 13.51f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.79f, 0.48f)
                lineToRelative(-4.77f, 7.8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 21f)
                lineTo(9f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                lineTo(5f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.84f, 0.45f)
                lineToRelative(-1.38f, 2.1f)
                arcTo(1.27f, 1.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 16.06f)
                lineTo(1.94f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.83f, 0.45f)
                lineToRelative(1.4f, 2.1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 11f)
                lineTo(8f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                lineTo(9f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.37f, -0.78f)
                lineToRelative(4.77f, 7.82f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.79f, 0.48f)
                curveToRelative(3.14f, 0.19f, 6.33f, 0.87f, 6.99f, 1.48f)
                curveTo(21.27f, 12.61f, 18.08f, 13.31f, 14.94f, 13.51f)
                close()
            }
        }.also { _FighterJet = it}
