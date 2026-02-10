package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OctagonPlus: ImageVector? = null

val Icons.Sr.OctagonPlus: ImageVector
    get() = _OctagonPlus ?: UXIcon(name = "OctagonPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.24f, 5.27f)
                lineToRelative(-3.52f, -3.52f)
                curveToRelative(-1.13f, -1.13f, -2.64f, -1.76f, -4.24f, -1.76f)
                horizontalLineToRelative(-4.97f)
                curveToRelative(-1.6f, 0f, -3.11f, 0.62f, -4.24f, 1.76f)
                lineToRelative(-3.52f, 3.52f)
                curveToRelative(-1.13f, 1.13f, -1.76f, 2.64f, -1.76f, 4.24f)
                verticalLineToRelative(4.97f)
                curveToRelative(0f, 1.6f, 0.62f, 3.11f, 1.76f, 4.24f)
                lineToRelative(3.52f, 3.52f)
                curveToRelative(1.13f, 1.13f, 2.64f, 1.76f, 4.24f, 1.76f)
                horizontalLineToRelative(4.97f)
                curveToRelative(1.6f, 0f, 3.11f, -0.62f, 4.24f, -1.76f)
                lineToRelative(3.52f, -3.52f)
                curveToRelative(1.13f, -1.13f, 1.76f, -2.64f, 1.76f, -4.24f)
                verticalLineToRelative(-4.97f)
                curveToRelative(0f, -1.6f, -0.62f, -3.11f, -1.76f, -4.24f)
                close()
                moveTo(17f, 13f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _OctagonPlus = it}
