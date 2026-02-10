package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MemberSearch: ImageVector? = null

val Icons.Ss.MemberSearch: ImageVector
    get() = _MemberSearch ?: UXIcon(name = "MemberSearch") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(5.69f, 0f, 9f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(23.96f, 22.55f)
                lineToRelative(-2.79f, -2.79f)
                curveToRelative(0.52f, -0.79f, 0.83f, -1.74f, 0.83f, -2.75f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                curveToRelative(1.02f, 0f, 1.96f, -0.31f, 2.75f, -0.83f)
                lineToRelative(2.79f, 2.79f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(10f, 17f)
                curveToRelative(0f, -1.07f, 0.25f, -2.09f, 0.68f, -3f)
                lineTo(5f, 14f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(5f)
                lineTo(16.85f, 24f)
                verticalLineToRelative(-0.01f)
                curveToRelative(-3.79f, -0.08f, -6.85f, -3.18f, -6.85f, -6.99f)
                close()
            }
        }.also { _MemberSearch = it}
