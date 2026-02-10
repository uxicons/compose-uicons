package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClawMarks: ImageVector? = null

val Icons.Ts.ClawMarks: ImageVector
    get() = _ClawMarks ?: UXIcon(name = "ClawMarks") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 0f)
                reflectiveCurveToRelative(14f, 10.5f, 24f, 24f)
                curveTo(15f, 15.5f, 7.5f, 8.5f, 0f, 0f)
                close()
                moveTo(23.96f, 14.88f)
                curveTo(18f, 5f, 9.08f, 0f, 9.08f, 0f)
                curveToRelative(5.42f, 6f, 8.42f, 8.5f, 14.88f, 14.88f)
                close()
                moveTo(0f, 9f)
                curveToRelative(6f, 7f, 9f, 10f, 15f, 15f)
                curveTo(8.5f, 15f, 0f, 9f, 0f, 9f)
                close()
            }
        }.also { _ClawMarks = it}
