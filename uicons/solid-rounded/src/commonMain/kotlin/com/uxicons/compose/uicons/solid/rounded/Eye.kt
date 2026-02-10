package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eye: ImageVector? = null

val Icons.Sr.Eye: ImageVector
    get() = _Eye ?: UXIcon(name = "Eye", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(256.1f, 256.1f)
                moveToRelative(-85.33f, 0f)
                arcToRelative(85.33f, 85.33f, 0f, isMoreThanHalf = true, isPositiveArc = true, 170.67f, 0f)
                arcToRelative(85.33f, 85.33f, 0f, isMoreThanHalf = true, isPositiveArc = true, -170.67f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(496.54f, 201.03f)
                curveTo(463.45f, 147.15f, 388.19f, 56.74f, 256.1f, 56.74f)
                reflectiveCurveTo(48.74f, 147.15f, 15.65f, 201.03f)
                curveToRelative(-20.86f, 33.74f, -20.86f, 76.38f, 0f, 110.12f)
                curveToRelative(33.09f, 53.89f, 108.35f, 144.3f, 240.45f, 144.3f)
                reflectiveCurveToRelative(207.36f, -90.41f, 240.45f, -144.3f)
                curveTo(517.41f, 277.41f, 517.41f, 234.78f, 496.54f, 201.03f)
                close()
                moveTo(256.1f, 384.1f)
                curveToRelative(-70.69f, 0f, -128f, -57.31f, -128f, -128f)
                reflectiveCurveToRelative(57.31f, -128f, 128f, -128f)
                reflectiveCurveToRelative(128f, 57.31f, 128f, 128f)
                curveTo(384.02f, 326.76f, 326.76f, 384.02f, 256.1f, 384.1f)
                close()
            }
        }.also { _Eye = it}
