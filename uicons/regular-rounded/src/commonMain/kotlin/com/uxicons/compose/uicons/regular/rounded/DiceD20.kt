package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD20: ImageVector? = null

val Icons.Rr.DiceD20: ImageVector
    get() = _DiceD20 ?: UXIcon(name = "DiceD20") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.57f, 4.31f)
                lineToRelative(-6f, -3.6f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.15f, 0f)
                lineToRelative(-6f, 3.6f)
                arcTo(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 8.6f)
                verticalLineToRelative(6.8f)
                arcToRelative(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.43f, 4.29f)
                lineToRelative(6f, 3.6f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.15f, 0f)
                lineToRelative(6f, -3.6f)
                arcTo(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 15.4f)
                lineTo(23f, 8.6f)
                arcTo(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.57f, 4.31f)
                close()
                moveTo(3.0f, 8.44f)
                lineToRelative(2.73f, 1.64f)
                lineTo(3f, 14.09f)
                reflectiveCurveTo(3f, 8.49f, 3.0f, 8.44f)
                close()
                moveTo(12.01f, 3.06f)
                lineTo(15.3f, 9f)
                lineTo(8.7f, 9f)
                close()
                moveTo(21.0f, 13.98f)
                lineTo(18.27f, 10.07f)
                lineTo(21f, 8.44f)
                curveTo(21f, 8.49f, 21f, 13.98f, 21f, 13.98f)
                close()
                moveTo(8.8f, 11f)
                lineTo(15.2f, 11f)
                lineTo(12f, 16.11f)
                close()
                moveTo(4.02f, 16.15f)
                lineToRelative(2.94f, -4.32f)
                lineTo(10.01f, 16.7f)
                close()
                moveTo(17.05f, 11.81f)
                lineTo(20.07f, 16.14f)
                lineTo(14f, 16.68f)
                close()
                moveTo(19.55f, 6.03f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.67f, 0.55f)
                lineTo(17.23f, 8.36f)
                lineToRelative(-3.1f, -5.58f)
                close()
                moveTo(4.46f, 6.03f)
                lineTo(9.87f, 2.78f)
                lineTo(6.77f, 8.36f)
                lineTo(3.79f, 6.58f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.46f, 6.03f)
                close()
                moveTo(4.9f, 18.24f)
                lineTo(11f, 18.8f)
                verticalLineToRelative(3.03f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.54f, -0.26f)
                close()
                moveTo(13.55f, 21.57f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.54f, 0.26f)
                verticalLineToRelative(-3.05f)
                lineToRelative(6.1f, -0.54f)
                close()
            }
        }.also { _DiceD20 = it}
