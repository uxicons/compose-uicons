package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LeafOak: ImageVector? = null

val Icons.Sc.LeafOak: ImageVector
    get() = _LeafOak ?: UXIcon(name = "LeafOak") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.93f, 5.4f)
                curveToRelative(0f, -3.06f, -1.43f, -4.49f, -4.49f, -4.49f)
                curveToRelative(-1.56f, 0f, -2.7f, 0.38f, -3.44f, 1.16f)
                curveToRelative(-0.46f, -0.11f, -0.98f, -0.16f, -1.55f, -0.16f)
                curveToRelative(-2.89f, 0f, -4.33f, 1.27f, -4.47f, 4.0f)
                curveToRelative(-2.57f, 0.14f, -3.85f, 1.42f, -3.99f, 3.99f)
                curveToRelative(-2.73f, 0.15f, -4.0f, 1.58f, -4.0f, 4.47f)
                curveToRelative(0f, 2.18f, 0.72f, 3.52f, 2.24f, 4.12f)
                lineToRelative(-1.8f, 1.8f)
                curveToRelative(-0.58f, 0.58f, -0.58f, 1.53f, 0f, 2.12f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                lineToRelative(1.8f, -1.8f)
                curveToRelative(0.6f, 1.52f, 1.95f, 2.24f, 4.12f, 2.24f)
                curveToRelative(2.89f, 0f, 4.33f, -1.27f, 4.47f, -4.0f)
                curveToRelative(2.57f, -0.14f, 3.85f, -1.42f, 3.99f, -3.99f)
                curveToRelative(2.73f, -0.15f, 4.0f, -1.58f, 4.0f, -4.47f)
                curveToRelative(0f, -0.57f, -0.05f, -1.09f, -0.16f, -1.55f)
                curveToRelative(0.78f, -0.74f, 1.16f, -1.87f, 1.16f, -3.44f)
                close()
                moveTo(15.66f, 9.6f)
                lineTo(7.68f, 17.58f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(7.98f, -7.98f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                close()
            }
        }.also { _LeafOak = it}
