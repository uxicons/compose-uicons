package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeCommit: ImageVector? = null

val Icons.Rr.CodeCommit: ImageVector
    get() = _CodeCommit ?: UXIcon(name = "CodeCommit") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 11f)
                horizontalLineToRelative(-4.07f)
                curveToRelative(-0.49f, -3.39f, -3.41f, -6f, -6.93f, -6f)
                reflectiveCurveToRelative(-6.44f, 2.61f, -6.93f, 6f)
                lineTo(1f, 11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineTo(5.07f, 13f)
                curveToRelative(0.49f, 3.39f, 3.41f, 6f, 6.93f, 6f)
                reflectiveCurveToRelative(6.44f, -2.61f, 6.93f, -6f)
                horizontalLineToRelative(4.07f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
            }
        }.also { _CodeCommit = it}
