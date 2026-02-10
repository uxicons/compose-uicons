package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ankh: ImageVector? = null

val Icons.Br.Ankh: ImageVector
    get() = _Ankh ?: UXIcon(name = "Ankh") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17.5f, 13f)
            horizontalLineToRelative(-2.41f)
            curveToRelative(1.36f, -1.93f, 2.91f, -4.64f, 2.91f, -7f)
            curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
            reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
            curveToRelative(0f, 2.35f, 1.55f, 5.07f, 2.91f, 7f)
            horizontalLineToRelative(-2.41f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-6.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(12f, 3f)
            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
            curveToRelative(0f, 1.67f, -1.56f, 4.25f, -3f, 6.14f)
            curveToRelative(-1.44f, -1.89f, -3f, -4.47f, -3f, -6.14f)
            curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
            close()
        }
    }.also { _Ankh = it }
