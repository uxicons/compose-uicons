package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IssueLoupe: ImageVector? = null

val Icons.Ts.IssueLoupe: ImageVector
    get() = _IssueLoupe ?: UXIcon(name = "IssueLoupe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.98f, 23.27f)
                lineToRelative(-6.57f, -6.57f)
                curveToRelative(1.61f, -1.77f, 2.6f, -4.12f, 2.6f, -6.7f)
                curveTo(20.01f, 4.49f, 15.52f, 0.01f, 10.01f, 0.01f)
                reflectiveCurveTo(0.01f, 4.49f, 0.01f, 10.01f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(2.58f, 0f, 4.92f, -0.99f, 6.7f, -2.6f)
                lineToRelative(6.57f, 6.57f)
                lineToRelative(0.71f, -0.71f)
                close()
                moveTo(1.01f, 10.01f)
                curveTo(1.01f, 5.04f, 5.04f, 1.01f, 10.01f, 1.01f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(1.01f, 14.97f, 1.01f, 10.01f)
                close()
                moveTo(11f, 15f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(13f, 8f)
                curveToRelative(0f, 1.12f, -0.62f, 2.15f, -1.62f, 2.67f)
                curveToRelative(-0.53f, 0.28f, -0.88f, 0.91f, -0.88f, 1.62f)
                verticalLineToRelative(0.71f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-0.71f)
                curveToRelative(0f, -1.09f, 0.54f, -2.06f, 1.42f, -2.51f)
                curveToRelative(0.67f, -0.35f, 1.08f, -1.03f, 1.08f, -1.78f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _IssueLoupe = it}
