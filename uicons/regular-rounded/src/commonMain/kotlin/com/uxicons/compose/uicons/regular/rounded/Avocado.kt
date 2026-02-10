package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Avocado: ImageVector? = null

val Icons.Rr.Avocado: ImageVector
    get() = _Avocado ?: UXIcon(name = "Avocado") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                curveToRelative(-6.14f, 0.02f, -4.44f, -10.17f, 0f, -10f)
                curveTo(16.44f, 9.83f, 18.14f, 20.02f, 12f, 20f)
                close()
                moveTo(12f, 12f)
                curveToRelative(-1.93f, -0.09f, -3.34f, 6.11f, 0f, 6f)
                curveTo(15.34f, 18.11f, 13.93f, 11.91f, 12f, 12f)
                close()
                moveTo(12f, 24f)
                curveTo(6.49f, 24f, 2f, 19.88f, 2f, 14.82f)
                curveTo(1.98f, 2.59f, 13.72f, -5.42f, 17.59f, 4.36f)
                curveToRelative(0.91f, 3.76f, 4.79f, 6.35f, 4.41f, 10.46f)
                curveTo(22f, 19.88f, 17.51f, 24f, 12f, 24f)
                close()
                moveTo(12f, 2f)
                curveToRelative(-6.37f, 0.26f, -14.27f, 18.97f, 0f, 20f)
                curveToRelative(6.36f, 0.14f, 10.44f, -6.86f, 6.45f, -11.68f)
                arcToRelative(16.97f, 16.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.77f, -5.39f)
                arcTo(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                close()
            }
        }.also { _Avocado = it}
