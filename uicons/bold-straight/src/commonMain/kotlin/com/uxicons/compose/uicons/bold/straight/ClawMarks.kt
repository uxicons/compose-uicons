package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClawMarks: ImageVector? = null

val Icons.Bs.ClawMarks: ImageVector
    get() = _ClawMarks ?: UXIcon(name = "ClawMarks") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 0f)
                reflectiveCurveToRelative(17.5f, 6f, 24f, 24f)
                curveTo(15.45f, 16.09f, 7.47f, 8.06f, 0f, 0f)
                close()
                moveTo(24f, 13.58f)
                curveTo(20.8f, 2.21f, 9.96f, 0f, 9.96f, 0f)
                curveToRelative(4.34f, 4.88f, 9.03f, 9.4f, 14.04f, 13.58f)
                close()
                moveTo(0f, 9f)
                curveToRelative(4.7f, 5.23f, 9.72f, 10.22f, 15f, 15f)
                curveTo(11.12f, 11.62f, 0f, 9f, 0f, 9f)
                close()
            }
        }.also { _ClawMarks = it}
