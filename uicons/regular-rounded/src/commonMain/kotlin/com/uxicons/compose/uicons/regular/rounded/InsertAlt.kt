package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsertAlt: ImageVector? = null

val Icons.Rr.InsertAlt: ImageVector
    get() = _InsertAlt ?: UXIcon(name = "InsertAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-14.04f)
                lineToRelative(3.24f, 3.24f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-4.24f, -4.24f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0f, -2.83f)
                lineToRelative(4.24f, -4.24f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-3.24f, 3.24f)
                horizontalLineToRelative(14.04f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(22.61f, 15.07f)
                curveToRelative(-0.52f, -0.2f, -1.09f, 0.05f, -1.29f, 0.57f)
                curveToRelative(-1.51f, 3.87f, -5.17f, 6.36f, -9.32f, 6.36f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                curveToRelative(4.15f, 0f, 7.81f, 2.5f, 9.32f, 6.36f)
                curveToRelative(0.2f, 0.51f, 0.78f, 0.77f, 1.29f, 0.57f)
                curveToRelative(0.52f, -0.2f, 0.77f, -0.78f, 0.57f, -1.29f)
                curveTo(21.37f, 3.0f, 16.98f, 0f, 12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(4.98f, 0f, 9.37f, -3.0f, 11.18f, -7.64f)
                curveToRelative(0.2f, -0.52f, -0.05f, -1.09f, -0.57f, -1.29f)
                close()
            }
        }.also { _InsertAlt = it}
