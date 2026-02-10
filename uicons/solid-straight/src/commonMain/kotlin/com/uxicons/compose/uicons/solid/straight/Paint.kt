package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Paint: ImageVector? = null

val Icons.Ss.Paint: ImageVector
    get() = _Paint ?: UXIcon(name = "Paint") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.02f, 23.98f)
                lineToRelative(0.08f, -1.05f)
                curveToRelative(0.08f, -1.1f, 0.55f, -6.69f, 2.31f, -8.45f)
                arcToRelative(5.04f, 5.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.12f, 7.12f)
                curveToRelative(-1.76f, 1.76f, -7.35f, 2.23f, -8.45f, 2.31f)
                close()
                moveTo(23.1f, 0.87f)
                arcToRelative(3.14f, 3.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.33f, 0f)
                lineToRelative(-10.52f, 10.52f)
                arcToRelative(6.97f, 6.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.34f, 4.32f)
                lineToRelative(10.51f, -10.51f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.33f)
                close()
            }
        }.also { _Paint = it}
