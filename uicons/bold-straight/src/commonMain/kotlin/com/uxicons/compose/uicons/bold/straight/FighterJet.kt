package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FighterJet: ImageVector? = null

val Icons.Bs.FighterJet: ImageVector
    get() = _FighterJet ?: UXIcon(name = "FighterJet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.38f, 8.08f)
                lineTo(12.28f, 3f)
                lineTo(14f, 3f)
                lineTo(14f, 0f)
                lineTo(7f, 0f)
                lineTo(7f, 8f)
                lineTo(4.62f, 8f)
                lineTo(3.5f, 6.88f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.38f, 6f)
                lineTo(0f, 6f)
                lineTo(0f, 18f)
                lineTo(1.38f, 18f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 17.12f)
                lineTo(4.62f, 16f)
                lineTo(7f, 16f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(7f)
                lineTo(14f, 21f)
                lineTo(12.28f, 21f)
                lineToRelative(3.09f, -5.05f)
                curveTo(21.1f, 15.49f, 24f, 14.16f, 24f, 12f)
                reflectiveCurveTo(21.1f, 8.51f, 15.38f, 8.08f)
                close()
                moveTo(14.4f, 13.01f)
                lineTo(13.63f, 13.06f)
                lineTo(10f, 18.98f)
                lineTo(10f, 13f)
                lineTo(4f, 13f)
                lineTo(4f, 11f)
                horizontalLineToRelative(6f)
                lineTo(10f, 5.03f)
                lineToRelative(3.63f, 5.95f)
                lineToRelative(0.78f, 0.05f)
                arcToRelative(25.79f, 25.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.9f, 0.98f)
                arcTo(25.79f, 25.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.4f, 13.01f)
                close()
            }
        }.also { _FighterJet = it}
