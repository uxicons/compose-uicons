package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Venus: ImageVector? = null

val Icons.Rc.Venus: ImageVector
    get() = _Venus ?: UXIcon(name = "Venus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.59f, 8.56f)
                curveToRelative(-0.03f, -4.86f, -2.65f, -7.47f, -7.61f, -7.56f)
                curveToRelative(-4.85f, 0.08f, -7.54f, 2.77f, -7.58f, 7.58f)
                curveToRelative(0.03f, 4.46f, 2.36f, 7.1f, 6.61f, 7.51f)
                lineToRelative(-0.01f, 2.56f)
                horizontalLineToRelative(-1.7f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.69f)
                lineToRelative(-0.0f, 1.35f)
                curveToRelative(0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0f, 1.0f, -0.45f, 1f, -1.0f)
                lineToRelative(0.0f, -1.35f)
                horizontalLineToRelative(1.69f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.68f)
                lineToRelative(0.01f, -2.57f)
                curveToRelative(4.28f, -0.41f, 6.55f, -2.99f, 6.58f, -7.52f)
                close()
                moveTo(6.41f, 8.58f)
                curveToRelative(0.02f, -3.69f, 1.86f, -5.51f, 5.58f, -5.58f)
                curveToRelative(3.86f, 0.07f, 5.59f, 1.79f, 5.61f, 5.56f)
                curveToRelative(-0.02f, 3.78f, -1.75f, 5.5f, -5.59f, 5.58f)
                curveToRelative(-3.79f, -0.07f, -5.57f, -1.85f, -5.59f, -5.56f)
                close()
            }
        }.also { _Venus = it}
