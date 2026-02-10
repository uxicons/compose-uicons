package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Balloon: ImageVector? = null

val Icons.Rs.Balloon: ImageVector
    get() = _Balloon ?: UXIcon(name = "Balloon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 9.38f)
                curveTo(22f, 4.21f, 17.51f, 0.01f, 12f, 0.01f)
                reflectiveCurveTo(2f, 4.21f, 2f, 9.38f)
                curveToRelative(0f, 5.28f, 3.36f, 11.12f, 8.1f, 12.39f)
                curveToRelative(-0.45f, 0.68f, -0.72f, 1.52f, -0.72f, 2.24f)
                horizontalLineToRelative(5.25f)
                curveToRelative(0f, -0.71f, -0.28f, -1.55f, -0.72f, -2.24f)
                curveToRelative(4.75f, -1.26f, 8.1f, -7.1f, 8.1f, -12.39f)
                close()
                moveTo(12f, 20.02f)
                curveToRelative(-4.51f, 0f, -8f, -5.72f, -8f, -10.64f)
                curveToRelative(0f, -4.06f, 3.59f, -7.36f, 8f, -7.36f)
                reflectiveCurveToRelative(8f, 3.3f, 8f, 7.36f)
                curveToRelative(0f, 4.92f, -3.49f, 10.64f, -8f, 10.64f)
                close()
                moveTo(15f, 10f)
                horizontalLineToRelative(1.97f)
                curveToRelative(-0.16f, 2.32f, -1.26f, 4.35f, -2.29f, 5.5f)
                lineToRelative(-1.42f, -1.28f)
                curveToRelative(0.79f, -0.9f, 1.63f, -2.45f, 1.75f, -4.22f)
                close()
            }
        }.also { _Balloon = it}
