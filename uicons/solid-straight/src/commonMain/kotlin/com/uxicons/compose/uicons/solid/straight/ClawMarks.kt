package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClawMarks: ImageVector? = null

val Icons.Ss.ClawMarks: ImageVector
    get() = _ClawMarks ?: UXIcon(name = "ClawMarks") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 0f)
                reflectiveCurveToRelative(14.73f, 8.73f, 24f, 24f)
                curveTo(15.45f, 16.09f, 7.47f, 8.06f, 0f, 0f)
                close()
                moveTo(23.96f, 14f)
                curveTo(18.5f, 3.5f, 9.96f, 0f, 9.96f, 0f)
                curveToRelative(4.33f, 5.04f, 9.01f, 9.69f, 14f, 14f)
                close()
                moveTo(0f, 9f)
                curveToRelative(4.7f, 5.23f, 9.72f, 10.22f, 15f, 15f)
                curveTo(9.5f, 13f, 0f, 9f, 0f, 9f)
                close()
            }
        }.also { _ClawMarks = it}
