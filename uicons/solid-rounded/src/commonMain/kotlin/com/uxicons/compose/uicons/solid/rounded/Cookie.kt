package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cookie: ImageVector? = null

val Icons.Sr.Cookie: ImageVector
    get() = _Cookie ?: UXIcon(name = "Cookie", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(394.67f, 32f)
                moveToRelative(-32f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(458.67f, 138.67f)
                moveToRelative(-32f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(510.78f, 231.55f)
                curveToRelative(-0.98f, -10.17f, -9.03f, -18.23f, -19.2f, -19.2f)
                curveToRelative(-101.65f, -9.79f, -182.11f, -90.26f, -191.89f, -191.91f)
                curveToRelative(-0.98f, -10.17f, -9.03f, -18.23f, -19.2f, -19.2f)
                curveTo(272.4f, 0.45f, 264.26f, 0f, 256f, 0f)
                curveTo(114.61f, 0f, 0f, 114.61f, 0f, 256f)
                reflectiveCurveToRelative(114.61f, 256f, 256f, 256f)
                reflectiveCurveToRelative(256f, -114.61f, 256f, -256f)
                curveTo(512f, 247.74f, 511.55f, 239.6f, 510.78f, 231.55f)
                close()
                moveTo(309.33f, 341.33f)
                curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
                reflectiveCurveToRelative(14.33f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.33f, 32f, 32f)
                reflectiveCurveTo(327.01f, 341.33f, 309.33f, 341.33f)
                lineTo(309.33f, 341.33f)
                close()
                moveTo(202.67f, 234.67f)
                curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
                reflectiveCurveToRelative(14.33f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.33f, 32f, 32f)
                reflectiveCurveTo(220.34f, 234.67f, 202.67f, 234.67f)
                close()
                moveTo(234.67f, 309.33f)
                curveToRelative(0f, 17.67f, -14.33f, 32f, -32f, 32f)
                reflectiveCurveToRelative(-32f, -14.33f, -32f, -32f)
                reflectiveCurveToRelative(14.33f, -32f, 32f, -32f)
                lineToRelative(0f, 0f)
                curveTo(220.34f, 277.33f, 234.67f, 291.66f, 234.67f, 309.33f)
                close()
            }
        }.also { _Cookie = it}
