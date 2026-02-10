package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IssueLoupe: ImageVector? = null

val Icons.Ss.IssueLoupe: ImageVector
    get() = _IssueLoupe ?: UXIcon(name = "IssueLoupe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.74f, 16.33f)
                curveToRelative(1.41f, -1.73f, 2.26f, -3.93f, 2.26f, -6.32f)
                curveTo(20f, 4.5f, 15.51f, 0.01f, 10f, 0.01f)
                reflectiveCurveTo(0f, 4.5f, 0f, 10.01f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(2.4f, 0f, 4.6f, -0.85f, 6.32f, -2.26f)
                lineToRelative(6.25f, 6.25f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-6.25f, -6.25f)
                close()
                moveTo(11f, 15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(11.38f, 10.66f)
                curveToRelative(-0.23f, 0.12f, -0.38f, 0.42f, -0.38f, 0.77f)
                verticalLineToRelative(0.57f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-0.57f)
                curveToRelative(0f, -1.1f, 0.56f, -2.07f, 1.46f, -2.54f)
                curveToRelative(0.34f, -0.17f, 0.54f, -0.51f, 0.54f, -0.89f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                curveToRelative(0f, 1.12f, -0.62f, 2.15f, -1.62f, 2.67f)
                close()
            }
        }.also { _IssueLoupe = it}
