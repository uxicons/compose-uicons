package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortAlt: ImageVector? = null

val Icons.Rc.SortAlt: ImageVector
    get() = _SortAlt ?: UXIcon(name = "SortAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.84f, 17.33f)
                curveToRelative(-0.49f, -0.25f, -1.09f, -0.06f, -1.35f, 0.43f)
                curveToRelative(-0.56f, 1.08f, -1.18f, 1.84f, -1.71f, 2.35f)
                verticalLineTo(2.0f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineTo(20.1f)
                curveToRelative(-0.53f, -0.51f, -1.15f, -1.26f, -1.71f, -2.35f)
                curveToRelative(-0.25f, -0.49f, -0.85f, -0.69f, -1.35f, -0.43f)
                curveToRelative(-0.49f, 0.25f, -0.69f, 0.85f, -0.43f, 1.35f)
                curveToRelative(1.71f, 3.32f, 4.04f, 4.23f, 4.13f, 4.26f)
                curveToRelative(0.26f, 0.1f, 0.52f, 0.08f, 0.7f, 0f)
                curveToRelative(0.1f, -0.04f, 2.43f, -0.94f, 4.13f, -4.26f)
                curveToRelative(0.25f, -0.49f, 0.06f, -1.09f, -0.43f, -1.35f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.16f, 6.67f)
                curveToRelative(0.49f, 0.25f, 1.09f, 0.06f, 1.35f, -0.43f)
                curveToRelative(0.56f, -1.08f, 1.18f, -1.84f, 1.71f, -2.35f)
                verticalLineTo(22.0f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(3.9f)
                curveToRelative(0.53f, 0.51f, 1.15f, 1.26f, 1.71f, 2.35f)
                curveToRelative(0.25f, 0.49f, 0.85f, 0.69f, 1.35f, 0.43f)
                curveToRelative(0.49f, -0.25f, 0.69f, -0.85f, 0.43f, -1.35f)
                curveToRelative(-1.71f, -3.32f, -4.04f, -4.23f, -4.13f, -4.26f)
                curveToRelative(-0.26f, -0.1f, -0.52f, -0.08f, -0.7f, 0f)
                curveToRelative(-0.1f, 0.04f, -2.43f, 0.94f, -4.13f, 4.26f)
                curveToRelative(-0.25f, 0.49f, -0.06f, 1.09f, 0.43f, 1.35f)
                close()
            }
        }.also { _SortAlt = it}
