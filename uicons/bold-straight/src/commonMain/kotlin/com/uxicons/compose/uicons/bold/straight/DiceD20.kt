package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD20: ImageVector? = null

val Icons.Bs.DiceD20: ImageVector
    get() = _DiceD20 ?: UXIcon(name = "DiceD20") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.76f, 0.49f)
                arcTo(3.38f, 3.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.29f, 0.46f)
                lineTo(1f, 5.62f)
                lineTo(1f, 18.38f)
                lineToRelative(9.25f, 5.13f)
                arcToRelative(3.43f, 3.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.77f, 0.49f)
                arcToRelative(3.29f, 3.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.7f, -0.47f)
                lineTo(23f, 18.38f)
                lineTo(23f, 5.62f)
                close()
                moveTo(16.81f, 11.26f)
                lineTo(20f, 9.49f)
                verticalLineToRelative(6.73f)
                close()
                moveTo(18.81f, 6.72f)
                lineTo(15.29f, 8.68f)
                lineToRelative(-2.96f, -5.55f)
                close()
                moveTo(11.66f, 3.13f)
                lineTo(8.71f, 8.68f)
                lineTo(5.19f, 6.72f)
                close()
                moveTo(7.19f, 11.26f)
                lineTo(4f, 16.22f)
                lineTo(4f, 9.49f)
                close()
                moveTo(4.69f, 17f)
                lineTo(12f, 17f)
                lineTo(8f, 10f)
                horizontalLineToRelative(8f)
                lineToRelative(-4f, 7f)
                lineTo(10.5f, 17f)
                lineToRelative(0f, 3.22f)
                close()
                moveTo(13.5f, 20.23f)
                lineTo(13.5f, 17f)
                horizontalLineToRelative(5.81f)
                close()
            }
        }.also { _DiceD20 = it}
