package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserGroupCrown: ImageVector? = null

val Icons.Sr.UserGroupCrown: ImageVector
    get() = _UserGroupCrown ?: UXIcon(name = "UserGroupCrown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 9f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(14f, 24f)
                horizontalLineToRelative(-13f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -4.14f, 3.36f, -7.5f, 7.5f, -7.5f)
                reflectiveCurveToRelative(7.5f, 3.36f, 7.5f, 7.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(17f, 11f)
                curveToRelative(-2.3f, 0f, -4.34f, 1.12f, -5.62f, 2.84f)
                curveToRelative(2.25f, 1.01f, 4.03f, 2.87f, 4.94f, 5.16f)
                horizontalLineToRelative(6.68f)
                curveToRelative(1f, 0f, 1f, -1f, 1f, -1f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                close()
                moveTo(12f, 7f)
                verticalLineToRelative(-4.29f)
                curveToRelative(0f, -0.32f, -0.2f, -0.6f, -0.5f, -0.71f)
                curveToRelative(-0.3f, -0.11f, -0.63f, -0.01f, -0.85f, 0.25f)
                lineToRelative(-1.1f, 1.55f)
                lineToRelative(-1.28f, -1.52f)
                curveToRelative(-0.42f, -0.42f, -1.12f, -0.41f, -1.58f, 0.04f)
                lineToRelative(-1.22f, 1.47f)
                reflectiveCurveToRelative(-1.27f, -1.69f, -1.3f, -1.72f)
                curveToRelative(-0.19f, -0.14f, -0.48f, -0.15f, -0.73f, -0.04f)
                curveToRelative(-0.27f, 0.12f, -0.43f, 0.39f, -0.43f, 0.68f)
                verticalLineToRelative(4.28f)
                close()
                moveTo(3.05f, 9f)
                curveToRelative(0.25f, 2.24f, 2.14f, 4f, 4.45f, 4f)
                reflectiveCurveToRelative(4.2f, -1.76f, 4.45f, -4f)
                close()
            }
        }.also { _UserGroupCrown = it}
