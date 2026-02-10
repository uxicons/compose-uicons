package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Party: ImageVector? = null

val Icons.Ss.Party: ImageVector
    get() = _Party ?: UXIcon(name = "Party") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 0f)
                horizontalLineToRelative(8f)
                lineTo(16f, 2f)
                lineTo(13f, 2f)
                lineTo(13f, 4.06f)
                arcToRelative(9.95f, 9.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0.41f)
                verticalLineToRelative(4.69f)
                curveTo(14.02f, 9.05f, 13.01f, 9f, 12f, 9f)
                reflectiveCurveToRelative(-2.02f, 0.05f, -3f, 0.15f)
                lineTo(9f, 4.46f)
                arcToRelative(9.95f, 9.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -0.41f)
                lineTo(11f, 2f)
                lineTo(8f, 2f)
                close()
                moveTo(2f, 14f)
                curveToRelative(0f, 0.82f, 1.88f, 1.93f, 5f, 2.54f)
                lineTo(7f, 11.46f)
                curveTo(3.88f, 12.07f, 2f, 13.18f, 2f, 14f)
                close()
                moveTo(17f, 5.35f)
                lineTo(17f, 9.43f)
                arcToRelative(15.95f, 15.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.47f, 1.4f)
                arcTo(10.03f, 10.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 5.35f)
                close()
                moveTo(9f, 11.16f)
                verticalLineToRelative(5.68f)
                arcTo(27.78f, 27.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17f)
                arcToRelative(27.78f, 27.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -0.16f)
                lineTo(15f, 11.16f)
                arcToRelative(28.2f, 28.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 0f)
                close()
                moveTo(17f, 11.46f)
                verticalLineToRelative(5.08f)
                curveToRelative(3.12f, -0.61f, 5f, -1.72f, 5f, -2.54f)
                reflectiveCurveTo(20.12f, 12.07f, 17f, 11.46f)
                close()
                moveTo(9f, 18.85f)
                verticalLineToRelative(4.69f)
                arcToRelative(9.99f, 9.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                verticalLineToRelative(-4.69f)
                curveToRelative(-0.98f, 0.1f, -1.99f, 0.15f, -3f, 0.15f)
                reflectiveCurveTo(9.98f, 18.95f, 9f, 18.85f)
                close()
                moveTo(17f, 22.65f)
                arcToRelative(10.03f, 10.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.47f, -5.47f)
                arcTo(15.95f, 15.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 18.57f)
                close()
                moveTo(7f, 22.65f)
                lineTo(7f, 18.57f)
                arcToRelative(15.95f, 15.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.47f, -1.4f)
                arcTo(10.03f, 10.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 22.65f)
                close()
                moveTo(2.53f, 10.82f)
                arcTo(15.95f, 15.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 9.43f)
                lineTo(7f, 5.35f)
                arcTo(10.03f, 10.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.53f, 10.82f)
                close()
            }
        }.also { _Party = it}
