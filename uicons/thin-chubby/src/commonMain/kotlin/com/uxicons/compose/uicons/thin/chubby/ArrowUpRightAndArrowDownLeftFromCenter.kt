package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpRightAndArrowDownLeftFromCenter: ImageVector? = null

val Icons.Tc.ArrowUpRightAndArrowDownLeftFromCenter: ImageVector
    get() = _ArrowUpRightAndArrowDownLeftFromCenter ?: UXIcon(name = "ArrowUpRightAndArrowDownLeftFromCenter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.55f, 13.75f)
                lineToRelative(-7.19f, 7.19f)
                curveToRelative(-0.31f, -1.11f, -0.71f, -3.46f, 0.24f, -6.47f)
                curveToRelative(0.08f, -0.26f, -0.06f, -0.54f, -0.33f, -0.63f)
                curveToRelative(-0.26f, -0.08f, -0.54f, 0.06f, -0.63f, 0.33f)
                curveToRelative(-1.47f, 4.62f, -0.02f, 7.78f, 0.05f, 7.91f)
                curveToRelative(0.05f, 0.1f, 0.13f, 0.19f, 0.24f, 0.24f)
                curveToRelative(0.09f, 0.04f, 1.52f, 0.7f, 3.83f, 0.7f)
                curveToRelative(1.16f, 0f, 2.53f, -0.17f, 4.07f, -0.66f)
                curveToRelative(0.26f, -0.08f, 0.41f, -0.36f, 0.33f, -0.63f)
                curveToRelative(-0.09f, -0.26f, -0.37f, -0.41f, -0.63f, -0.33f)
                curveToRelative(-3.01f, 0.96f, -5.36f, 0.56f, -6.47f, 0.24f)
                lineToRelative(7.18f, -7.18f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(-0.51f, -0.2f, -0.71f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.3f, 1.94f)
                curveToRelative(-0.05f, -0.1f, -0.13f, -0.19f, -0.24f, -0.24f)
                curveToRelative(-0.09f, -0.04f, -1.52f, -0.7f, -3.83f, -0.7f)
                curveToRelative(-1.16f, 0f, -2.53f, 0.17f, -4.07f, 0.66f)
                curveToRelative(-0.26f, 0.08f, -0.41f, 0.36f, -0.33f, 0.63f)
                curveToRelative(0.09f, 0.26f, 0.37f, 0.41f, 0.63f, 0.33f)
                curveToRelative(3.01f, -0.96f, 5.36f, -0.56f, 6.47f, -0.24f)
                lineToRelative(-7.18f, 7.18f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                reflectiveCurveToRelative(0.51f, 0.2f, 0.71f, 0f)
                lineToRelative(7.19f, -7.19f)
                curveToRelative(0.31f, 1.11f, 0.71f, 3.46f, -0.24f, 6.47f)
                curveToRelative(-0.08f, 0.26f, 0.06f, 0.54f, 0.33f, 0.63f)
                curveToRelative(0.26f, 0.08f, 0.54f, -0.06f, 0.63f, -0.33f)
                curveToRelative(1.47f, -4.62f, 0.02f, -7.78f, -0.05f, -7.91f)
                close()
            }
        }.also { _ArrowUpRightAndArrowDownLeftFromCenter = it}
