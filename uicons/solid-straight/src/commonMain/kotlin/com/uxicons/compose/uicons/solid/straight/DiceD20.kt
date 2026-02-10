package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD20: ImageVector? = null

val Icons.Ss.DiceD20: ImageVector
    get() = _DiceD20 ?: UXIcon(name = "DiceD20") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.2f, 11f)
                lineTo(12f, 16.11f)
                lineTo(8.8f, 11f)
                close()
                moveTo(15.3f, 9f)
                lineTo(12f, 2.97f)
                lineTo(8.69f, 9f)
                close()
                moveTo(6.94f, 11.8f)
                lineTo(3.83f, 16.16f)
                lineToRelative(6.18f, 0.55f)
                close()
                moveTo(18.28f, 10.07f)
                lineTo(23f, 16.68f)
                lineTo(23f, 7.27f)
                close()
                moveTo(5.72f, 10.07f)
                lineTo(1f, 7.29f)
                lineTo(1f, 16.68f)
                close()
                moveTo(17.24f, 8.37f)
                lineTo(22.03f, 5.52f)
                lineTo(13.54f, 0.34f)
                arcTo(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.64f, 0f)
                close()
                moveTo(13f, 18.78f)
                lineTo(13f, 24f)
                arcToRelative(2.91f, 2.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.54f, -0.23f)
                lineToRelative(9.42f, -5.85f)
                close()
                moveTo(11f, 18.8f)
                lineToRelative(-9.97f, -0.88f)
                lineToRelative(9.42f, 5.85f)
                arcTo(2.91f, 2.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 24f)
                close()
                moveTo(17.06f, 11.79f)
                lineTo(14f, 16.69f)
                lineToRelative(6.17f, -0.53f)
                close()
                moveTo(6.76f, 8.37f)
                lineTo(11.36f, 0f)
                arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.91f, 0.34f)
                lineTo(1.95f, 5.53f)
                close()
            }
        }.also { _DiceD20 = it}
