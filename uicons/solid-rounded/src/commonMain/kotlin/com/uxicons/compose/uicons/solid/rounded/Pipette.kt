package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pipette: ImageVector? = null

val Icons.Sr.Pipette: ImageVector
    get() = _Pipette ?: UXIcon(name = "Pipette") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.68f, 7.39f)
                curveToRelative(-0.92f, 0.92f, -0.71f, 2.84f, 0.03f, 4.17f)
                arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.96f, 2.92f)
                lineToRelative(-7.23f, -7.23f)
                arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.92f, -3.96f)
                curveToRelative(1.33f, 0.73f, 3.25f, 0.94f, 4.17f, 0.03f)
                lineToRelative(2.48f, -2.48f)
                arcToRelative(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.07f, 0f)
                arcToRelative(2.88f, 2.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4.08f)
                close()
                moveTo(1.97f, 17.35f)
                arcToRelative(3.31f, 3.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.58f, 3.85f)
                lineToRelative(-1.09f, 1.09f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.41f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 0f)
                lineToRelative(1.09f, -1.09f)
                arcToRelative(3.26f, 3.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.85f, -0.59f)
                lineToRelative(7.4f, -7.4f)
                lineToRelative(-4.68f, -4.69f)
                close()
            }
        }.also { _Pipette = it}
