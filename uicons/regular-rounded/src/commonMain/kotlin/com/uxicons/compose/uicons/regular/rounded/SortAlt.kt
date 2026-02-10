package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortAlt: ImageVector? = null

val Icons.Rr.SortAlt: ImageVector
    get() = _SortAlt ?: UXIcon(name = "SortAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.29f, 17.71f)
                lineToRelative(-3.29f, 3.29f)
                verticalLineTo(1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineTo(21f)
                lineToRelative(-3.29f, -3.29f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(4.29f, 4.29f)
                curveToRelative(0.39f, 0.39f, 0.9f, 0.58f, 1.41f, 0.58f)
                reflectiveCurveToRelative(1.02f, -0.2f, 1.41f, -0.58f)
                lineToRelative(4.29f, -4.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0f)
                close()
                moveTo(22.71f, 6.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineTo(18.41f, 0.59f)
                curveTo(18.02f, 0.2f, 17.51f, 0f, 17f, 0f)
                reflectiveCurveToRelative(-1.02f, 0.2f, -1.41f, 0.58f)
                lineToRelative(-4.29f, 4.29f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(3.29f, -3.29f)
                verticalLineTo(23f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(3f)
                lineToRelative(3.29f, 3.29f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                close()
            }
        }.also { _SortAlt = it}
