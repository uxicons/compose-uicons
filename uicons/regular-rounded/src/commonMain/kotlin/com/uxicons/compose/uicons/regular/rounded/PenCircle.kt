package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenCircle: ImageVector? = null

val Icons.Rr.PenCircle: ImageVector
    get() = _PenCircle ?: UXIcon(name = "PenCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(13.38f, 6.38f)
                lineToRelative(-5.91f, 5.91f)
                curveToRelative(-0.94f, 0.94f, -1.47f, 2.2f, -1.47f, 3.54f)
                verticalLineToRelative(1.17f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.17f)
                curveToRelative(1.33f, 0f, 2.59f, -0.52f, 3.54f, -1.47f)
                lineToRelative(5.91f, -5.91f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0f, -4.24f)
                reflectiveCurveToRelative(-3.07f, -1.17f, -4.24f, 0f)
                close()
                moveTo(10.29f, 15.12f)
                curveToRelative(-0.56f, 0.56f, -1.33f, 0.88f, -2.12f, 0.88f)
                horizontalLineToRelative(-0.17f)
                verticalLineToRelative(-0.17f)
                curveToRelative(0f, -0.79f, 0.32f, -1.56f, 0.88f, -2.12f)
                lineToRelative(3.46f, -3.46f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.46f, 3.46f)
                close()
                moveTo(16.21f, 9.21f)
                lineToRelative(-1.04f, 1.04f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.04f, -1.04f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                close()
            }
        }.also { _PenCircle = it}
