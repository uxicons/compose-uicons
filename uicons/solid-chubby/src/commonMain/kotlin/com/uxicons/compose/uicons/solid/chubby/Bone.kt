package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bone: ImageVector? = null

val Icons.Sc.Bone: ImageVector
    get() = _Bone ?: UXIcon(name = "Bone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.94f, 4.06f)
                curveToRelative(-0.29f, -2.06f, -1.58f, -3.06f, -3.94f, -3.06f)
                curveToRelative(-2.69f, 0f, -4f, 1.31f, -4f, 4f)
                curveToRelative(0f, 0.94f, 0.16f, 1.68f, 0.48f, 2.28f)
                curveToRelative(-0.87f, 0.66f, -1.82f, 1.46f, -2.78f, 2.42f)
                reflectiveCurveToRelative(-1.76f, 1.91f, -2.42f, 2.78f)
                curveToRelative(-0.6f, -0.31f, -1.34f, -0.48f, -2.28f, -0.48f)
                curveToRelative(-2.69f, 0f, -4f, 1.31f, -4f, 4f)
                curveToRelative(0f, 2.36f, 1.0f, 3.65f, 3.06f, 3.94f)
                curveToRelative(0.29f, 2.06f, 1.58f, 3.06f, 3.94f, 3.06f)
                curveToRelative(2.69f, 0f, 4f, -1.31f, 4f, -4f)
                curveToRelative(0f, -0.94f, -0.16f, -1.68f, -0.48f, -2.28f)
                curveToRelative(0.87f, -0.66f, 1.82f, -1.46f, 2.78f, -2.42f)
                reflectiveCurveToRelative(1.76f, -1.91f, 2.42f, -2.78f)
                curveToRelative(0.6f, 0.31f, 1.34f, 0.48f, 2.28f, 0.48f)
                curveToRelative(2.69f, 0f, 4f, -1.31f, 4f, -4f)
                curveToRelative(0f, -2.36f, -1.0f, -3.65f, -3.06f, -3.94f)
                close()
            }
        }.also { _Bone = it}
