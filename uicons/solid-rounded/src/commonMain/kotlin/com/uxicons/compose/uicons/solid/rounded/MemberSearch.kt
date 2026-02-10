package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MemberSearch: ImageVector? = null

val Icons.Sr.MemberSearch: ImageVector
    get() = _MemberSearch ?: UXIcon(name = "MemberSearch") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.71f, 23.71f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-2.54f, -2.54f)
                curveToRelative(-0.79f, 0.52f, -1.74f, 0.83f, -2.75f, 0.83f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                curveToRelative(0f, 1.02f, -0.31f, 1.96f, -0.83f, 2.75f)
                lineToRelative(2.54f, 2.54f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(9f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(12.31f, 0f, 9f, 0f)
                reflectiveCurveTo(3f, 2.69f, 3f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(10f, 17f)
                curveToRelative(0f, -1.01f, 0.22f, -1.97f, 0.6f, -2.83f)
                curveToRelative(-0.52f, -0.1f, -1.05f, -0.17f, -1.6f, -0.17f)
                curveTo(4.04f, 14f, 0.01f, 18.03f, 0f, 22.98f)
                curveToRelative(-0.0f, 0.56f, 0.44f, 1.02f, 1f, 1.02f)
                lineTo(17f, 24f)
                curveToRelative(-3.87f, 0f, -7f, -3.13f, -7f, -7f)
                close()
            }
        }.also { _MemberSearch = it}
