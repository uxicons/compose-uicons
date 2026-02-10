package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pipette: ImageVector? = null

val Icons.Ss.Pipette: ImageVector
    get() = _Pipette ?: UXIcon(name = "Pipette") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3.02f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.89f, 2.14f)
                lineToRelative(-3.41f, 3.41f)
                arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.07f, 4.84f)
                lineToRelative(-1.44f, 1.4f)
                lineToRelative(-9f, -9f)
                lineToRelative(1.4f, -1.44f)
                arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.84f, -0.07f)
                lineToRelative(3.4f, -3.41f)
                arcToRelative(3.09f, 3.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.28f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.89f, 2.14f)
                close()
                moveTo(1.91f, 17.68f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.58f, 3.57f)
                lineToRelative(-1.33f, 1.33f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.33f, -1.33f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.57f, -0.58f)
                lineToRelative(8.05f, -8.05f)
                lineToRelative(-4.41f, -4.41f)
                close()
            }
        }.also { _Pipette = it}
