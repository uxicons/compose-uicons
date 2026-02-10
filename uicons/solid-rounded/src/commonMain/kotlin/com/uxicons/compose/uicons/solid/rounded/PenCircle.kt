package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenCircle: ImageVector? = null

val Icons.Sr.PenCircle: ImageVector
    get() = _PenCircle ?: UXIcon(name = "PenCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.75f, 11.66f)
                lineToRelative(-3.46f, 3.46f)
                curveToRelative(-0.56f, 0.56f, -1.33f, 0.88f, -2.12f, 0.88f)
                horizontalLineToRelative(-0.17f)
                verticalLineToRelative(-0.17f)
                curveToRelative(0f, -0.79f, 0.32f, -1.56f, 0.88f, -2.12f)
                lineToRelative(3.46f, -3.46f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(14.79f, 7.79f)
                lineToRelative(-1.04f, 1.04f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.04f, -1.04f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(17.62f, 6.38f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0f)
                lineToRelative(-5.91f, 5.91f)
                curveToRelative(-0.94f, 0.94f, -1.47f, 2.2f, -1.47f, 3.54f)
                verticalLineToRelative(1.17f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.17f)
                curveToRelative(1.33f, 0f, 2.59f, -0.52f, 3.54f, -1.47f)
                lineToRelative(5.91f, -5.91f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0f, -4.24f)
                close()
            }
        }.also { _PenCircle = it}
