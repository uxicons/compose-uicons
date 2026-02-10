package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MemberSearch: ImageVector? = null

val Icons.Bs.MemberSearch: ImageVector
    get() = _MemberSearch ?: UXIcon(name = "MemberSearch") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.05f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(12.36f, 0f, 9.05f, 0f)
                reflectiveCurveTo(3.05f, 2.69f, 3.05f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(9.05f, 3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                close()
                moveTo(23.95f, 21.79f)
                lineToRelative(-2.49f, -2.49f)
                curveToRelative(0.36f, -0.69f, 0.58f, -1.46f, 0.58f, -2.29f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                curveToRelative(0.83f, 0f, 1.6f, -0.22f, 2.29f, -0.58f)
                lineToRelative(2.49f, 2.49f)
                lineToRelative(2.12f, -2.12f)
                close()
                moveTo(17.05f, 19f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(10.73f, 14f)
                curveToRelative(-0.43f, 0.91f, -0.68f, 1.93f, -0.68f, 3f)
                lineTo(5.05f, 17f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(5f)
                lineTo(0.05f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(5.68f)
                close()
            }
        }.also { _MemberSearch = it}
