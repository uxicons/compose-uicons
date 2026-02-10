package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PatientFile: ImageVector? = null

val Icons.Rs.PatientFile: ImageVector
    get() = _PatientFile ?: UXIcon(name = "PatientFile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4.58f)
                lineToRelative(-3.45f, -3.42f)
                horizontalLineToRelative(-7.55f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-13f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(7f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5.26f)
                lineToRelative(-4f, -2f)
                horizontalLineToRelative(-0.74f)
                close()
                moveTo(22f, 22f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-13f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4.26f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(9.74f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(13f, 15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _PatientFile = it}
