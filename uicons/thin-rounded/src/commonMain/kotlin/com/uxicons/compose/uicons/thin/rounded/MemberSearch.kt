package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MemberSearch: ImageVector? = null

val Icons.Tr.MemberSearch: ImageVector
    get() = _MemberSearch ?: UXIcon(name = "MemberSearch") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(12.31f, 0f, 9f, 0f)
                reflectiveCurveTo(3f, 2.69f, 3f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(9f, 1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                reflectiveCurveTo(6.24f, 1f, 9f, 1f)
                close()
                moveTo(23.85f, 23.15f)
                lineToRelative(-3.85f, -3.85f)
                curveToRelative(0.62f, -0.77f, 1f, -1.73f, 1f, -2.79f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                curveToRelative(1.06f, 0f, 2.02f, -0.38f, 2.79f, -1f)
                lineToRelative(3.85f, 3.85f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                close()
                moveTo(16.5f, 20f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(10.0f, 14.54f)
                curveToRelative(-0.02f, 0.28f, -0.26f, 0.48f, -0.53f, 0.47f)
                curveToRelative(-0.16f, -0.01f, -0.31f, -0.01f, -0.47f, -0.01f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -4.96f, 4.04f, -9f, 9f, -9f)
                curveToRelative(0.18f, 0f, 0.35f, 0.01f, 0.53f, 0.02f)
                curveToRelative(0.28f, 0.02f, 0.49f, 0.25f, 0.47f, 0.53f)
                close()
            }
        }.also { _MemberSearch = it}
